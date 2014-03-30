package net.vasilkovka.site.dao;

import net.vasilkovka.site.domain.VKMapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ivan Zhuravel
 * Date: 3/30/14
 * Time: 10:40 PM
 *
 */
public interface VkDao {
    
    void addVkProfile(VKMapper forSave);

    VKMapper getVkProfile(Integer id);
    
    void removeVkProfile(Integer id);
    
    void updateVkProfile(VKMapper forSave);
}
