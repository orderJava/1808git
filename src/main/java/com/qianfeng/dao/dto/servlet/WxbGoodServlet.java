package com.qianfeng.dao.dto.servlet;

import com.qianfeng.dao.dto.WxbGood;
import com.qianfeng.dao.dto.servce.WxbGoodService;
import com.qianfeng.dao.dto.servce.WxbGoodServiceImpl;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class WxbGoodServlet extends BaseServlet {
    public static final String UPLOAD_PATH = "D:\\asdas";
    final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    WxbGoodService wxbGoodService = applicationContext.getBean(WxbGoodServiceImpl.class);

    public void queryWxbGoodByPage(HttpServletRequest req,HttpServletResponse resp){
        String pageStr = req.getParameter("page");
        try {
            pageStr = pageStr ==null?"1":pageStr;
            List<WxbGood> wxbGoodList = wxbGoodService.queryGoodsPage(Integer.parseInt(pageStr));
            req.setAttribute("wxbGoodList",wxbGoodList);
            req.getRequestDispatcher("wxbgood.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertGoods(HttpServletRequest req, HttpServletResponse resp) throws IOException, FileUploadException {
        WxbGood wxbGood = new WxbGood();
        String goodId = UUID.randomUUID().toString().substring(2,10);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        wxbGood.setGoodId(goodId);
        wxbGood.setCustomerId("11");
        wxbGood.setSkuTitle("22");
        wxbGood.setSkuCost("33");
        wxbGood.setSkuPrice("44");
        wxbGood.setSkuPmoney("55");
        wxbGood.setCopyIds("6622");
        wxbGood.setForwardLink("222");
        wxbGood.setState(1);
        wxbGood.setCreateTime(timestamp);
        wxbGood.setToped(1);
        wxbGood.setRecomed(1);
        wxbGood.setTopedTime(timestamp);
        wxbGood.setRecomedTime(timestamp);
        wxbGood.setSpcId("1");
        wxbGood.setZonId("22");
        wxbGood.setWebsite("1");
        wxbGood.setIswxpay(1);
        wxbGood.setIsfdfk(1);
        wxbGood.setLeixingId(1);
        wxbGood.setKfqq("3333");
        if(ServletFileUpload.isMultipartContent(req)){
            ServletFileUpload upload = new ServletFileUpload();
            upload.setSizeMax(10 * 1024 * 1024);
            FileItemIterator itr = upload.getItemIterator(req);
            int i = 0;
            while (itr.hasNext()){
                FileItemStream item = itr.next();
                if(item.isFormField()){
                   String value= Streams.asString(item.openStream(),"utf-8");
                    switch (item.getFieldName()){
                        case "good_name":
                            wxbGood.setGoodName(value);
                            break;
                        case "type_id":
                            wxbGood.setTypeId(value);
                            break;
                        case "order_no":
                            wxbGood.setOrderNo(Long.parseLong(value));
                            break;
                        case "sell_num":
                            wxbGood.setSellNum(Long.parseLong(value));
                            break;
                        case "promote_desc":
                            wxbGood.setPromoteDesc(value);
                            break;
                        case "tags":
                            wxbGood.setTags(value);
                            break;
                        case "copy_desc":
                            wxbGood.setCopyDesc(value);
                            break;
                    }
                }else {
                    //获得文件名,进行处理
                    String filename = item.getName();
                    if (filename != null) {
                        String filename2 = UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));
                        //保存新文件名,用于存入数据库
                        if(i == 0){
                            wxbGood.setGoodPic(filename2);
                        }
                        if(i == 1){
                            wxbGood.setGoodPic1(filename2);
                        }
                        if(i == 2){
                            wxbGood.setGoodPic2(filename2);
                        }
                        filename = UPLOAD_PATH + filename2;
                        //创建文件输出流
                        FileOutputStream out = new FileOutputStream(filename);
                        //读上传文件流,写入文件
                        Streams.copy(item.openStream(), out, true);
                        System.out.println("图片上传成功");
                        i++;
                    }
                }
            }
        }
        WxbGoodService wxbGoodService = new WxbGoodServiceImpl();
        wxbGoodService.insertGoods(wxbGood);
        System.out.println("图片上传成功");
        queryWxbGoodByPage(req,resp);
    }
}
