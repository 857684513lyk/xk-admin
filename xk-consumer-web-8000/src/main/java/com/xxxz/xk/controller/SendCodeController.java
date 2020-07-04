package com.xxxz.xk.controller;

import com.xxxz.xk.config.aliduanxin.SmsUtil;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.service.UserServiceFeign;
import com.xxxz.xk.util.math.MathUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Classname SendCodeController
 * @Description TODO
 * @Date 2020/7/4 15:00
 * @CreateComputer by PC
 * @Created by cxd
 */
@RestController
public class SendCodeController extends BaseController{

    @Resource
    UserServiceFeign userServiceFeign;
    @Resource
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 发送登录验证码,手机号必须存在
     *
     * @return
     */
    @RequestMapping("/sendLoginCode")
    @ResponseBody
    ResponseDTO sendLoginCode(String phone) {//
        // 先生成一个6为随机数
        String code = MathUtil.getRandomStr(6);
        // 此时应该把这个验证发给阿里云，让阿里云给这个手机发送验证码
        // 发送验证码之前应该去验证手机号是否正确。
        // 应该去判断是否有这个手机号。
        if (userServiceFeign.checkPhoneExist(phone)) {// 这个用户如果存在才发，不存在就不发了
            try {
                SmsUtil.sendSmsCode(phone, code, "SMS_185242830");// 发送验证码
//                getSession().setAttribute("loginCode", code);

                //Redis 验证码
                // 创建session之后，将session存入redis,并且指定时长为30分钟；
                redisTemplate.opsForValue().set(phone+"loginCode", code, 30, TimeUnit.MINUTES);// 保存三十分钟

            } catch (Exception e) {
                e.printStackTrace();
                return ResponseDTO.fail("验证码发送失败");
            }
            return ResponseDTO.ok("验证码发送成功");
        }
        return ResponseDTO.fail("验证码发送失败");
    }

    /**
     * 发送登录验证码,手机号必须存在
     *
     * @return
     */
    @RequestMapping("/sendClientLoginCode")
    @ResponseBody
    ResponseDTO sendClientLoginCode(String phone) {//
        // 先生成一个6为随机数
        String code = MathUtil.getRandomStr(6);
        // 此时应该把这个验证发给阿里云，让阿里云给这个手机发送验证码
        // 发送验证码之前应该去验证手机号是否正确。
        // 应该去判断是否有这个手机号。
        try {
            SmsUtil.sendSmsCode(phone, code, "SMS_185242830");// 发送验证码
            getSession().setAttribute("loginCode", code);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDTO.fail("验证码发送失败");
        }
        return ResponseDTO.ok("验证码发送成功");
    }


}
