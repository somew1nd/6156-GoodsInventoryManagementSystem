package top;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.faquan.config.springconfig;
import top.faquan.domainORpojo.client;
import top.faquan.service.bookService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springconfig.class)
public class clientservicetest {
    @Autowired
    private bookService bookService;

    @Test
    public void saveAllTset(){
        client faquan = new client("sdsds", "132134", "192.168.1.1", 8000);
        boolean b = bookService.saveAll(faquan);
        System.out.println(b);
    }

    @Test
    public void selectAll(){
        List<client> clients = bookService.selectAll();
        System.out.println(clients);
    }



}
