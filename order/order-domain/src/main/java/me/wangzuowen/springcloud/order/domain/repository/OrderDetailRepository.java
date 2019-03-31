package me.wangzuowen.springcloud.order.domain.repository;

import me.wangzuowen.springcloud.order.domain.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}