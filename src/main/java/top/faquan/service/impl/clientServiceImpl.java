package top.faquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.faquan.domainORpojo.client;
import top.faquan.dao.clientDao;
import top.faquan.service.bookService;

import java.util.List;

@Service
public class clientServiceImpl implements bookService {
    @Autowired
    clientDao clientDao;

    @Override
    public boolean saveAll(client client) {
        int i = clientDao.saveAll(client);
        return i > 0;
    }

    @Override
    public boolean save(client client) {
        int i = clientDao.save(client);
        return i > 0;
    }

    @Override
    public boolean delete(String username) {
        int i = clientDao.delete(username);
        return i > 0;
    }

    @Override
    public client selectByUsername(String username) {
        return clientDao.selectByUsername(username);
    }

    @Override
    public List<client> selectAll() {
        return clientDao.selectAll();
    }

    @Override
    public client getByNameAndPassword(String username, String password) {
        return clientDao.getByNameAndPassword(username,password);
    }


}
