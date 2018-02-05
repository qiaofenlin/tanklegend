package com.yjg.tanklegend.domain;

import javax.persistence.*;
import java.util.List;

/**
 * @qfl qiao
 * @date 18-2-3 下午8:45
 */
@Entity
@Table(name = "user_friends")
public class UserFriends {

    @Id
    @GeneratedValue
    private Integer u_id;

    @OneToOne(mappedBy = "user_tank")
    private TankUser tankUser;

    private List<TankUser> friendlist;

    public UserFriends() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public TankUser getTankUser() {
        return tankUser;
    }

    public void setTankUser(TankUser tankUser) {
        this.tankUser = tankUser;
    }

    public List<TankUser> getFriendlist() {
        return friendlist;
    }

    public void setFriendlist(List<TankUser> friendlist) {
        this.friendlist = friendlist;
    }
}


