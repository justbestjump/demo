package jpa.dao;

import jpa.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import tk.mybatis.mapper.common.Mapper;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

public interface UserMapper extends Mapper<User>{
    public static void main(String[] args) {
        System.out.println("dasdas");
    }
    public static void main(String[] args) {
        System.out.println("dasd1");
    }
}
