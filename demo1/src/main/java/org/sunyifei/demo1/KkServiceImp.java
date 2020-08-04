package org.sunyifei.demo1;

import org.springframework.stereotype.Service;

@Service
public class KkServiceImp implements KkService{
    @Override
    public String show() {
        return "nobudy knows dubbo better than me !";
    }
}
