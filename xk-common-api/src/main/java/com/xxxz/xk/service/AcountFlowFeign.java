package com.xxxz.xk.service;

import com.xxxz.xk.config.feign.FeignClientConfig;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.AccountFlow;
import com.xxxz.xk.pojo.query.AccountFlowQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value = "accountflow-rest", path = "accountflow", configuration = FeignClientConfig.class)
public interface AcountFlowFeign {


    /**
     * @param id 流水帐号id
     * @return 返回面试题信息
     */
     @RequestMapping("/findUserById/{id}")
    ResponseDTO findFlowById(@PathVariable Long id);

    /**
     * 对用户的流水进行分页查询
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listAccountFlow")
    PageDTO listAccountFlow(AccountFlowQuery query);

    @RequestMapping("/addAccountFlow")
    ResponseDTO addAccountFlow(AccountFlow accountFlow);

    @RequestMapping("/deleteAccountFlow")
    ResponseDTO deleteAccountFlow(AccountFlow accountFlow);

    @RequestMapping("/updateAccountFlow")
    ResponseDTO updateAccountFlow(AccountFlow accountFlow);
}
