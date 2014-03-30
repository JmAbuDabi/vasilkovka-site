package net.vasilkovka.site.domain;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Ivan Zhuravel
 * Date: 3/30/14
 * Time: 10:36 PM
 *
 */
@Entity
@Table(name = "vk")
public class VKMapper {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    
    private Integer userId;
    
    private String vkUserId;
    
    private String accessToken;

    public VKMapper() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getVkUserId() {
        return vkUserId;
    }

    public void setVkUserId(String vkUserId) {
        this.vkUserId = vkUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
