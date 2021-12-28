package studio.feidian.dha;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

/**
 * @author xunjiu
 * @date 2021/12/28 11:47
 **/
@Service
public class DataBaseClient {
    private ConcurrentHashMap<String,Object> map;

    public Object set(String key,Object value){
        return map.put(key,value);
    }

    public Object get
}
