package top.faquan.service;
import org.springframework.transaction.annotation.Transactional;
import top.faquan.domainORpojo.client;

import java.util.List;

@Transactional
public interface bookService {
    public boolean saveAll(client client);

    public boolean save(client client);

    public boolean delete(String username);

    public client selectByUsername(String username);

    public List<client> selectAll();

    public client getByNameAndPassword(String username, String password);

}
