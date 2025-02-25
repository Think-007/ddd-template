package com.think.www.controller;

import com.think.www.core.TkResult;
import com.think.www.dto.OrderDetailDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-05-17 16:09
 */
@RestController
@RequestMapping("/demo")
public class IndexController {

    @PostMapping("/index")
    public Map<String, String> indexInfo() {

        HashMap<String, String> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put("aaa", "999999");

        return objectObjectHashMap;

    }

    @GetMapping("/order-list")
    public TkResult<List<OrderDetailDTO>> listOrderDetail() {

        ArrayList<OrderDetailDTO> orderDetailDTOS = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
            orderDetailDTO.setId(i);
            orderDetailDTO.setOrderId("ox12345---" + i);
            orderDetailDTO.setPrice(BigDecimal.valueOf(10.354+i));
            orderDetailDTO.setCreateTime(LocalDateTime.now());
            orderDetailDTO.setCreateBy(10325+i);
            orderDetailDTOS.add(orderDetailDTO);
        }

        return new TkResult<>(0,orderDetailDTOS);

    }

}
