package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092500594198";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDrP+6z8qQc/Ac8KP+I/A/IlShEf6DXmNbxuAJQIJDL6V30EFru5iK8ikrcSDRWC2y6Lst8o54ZNGgbl0KcIuRnJUg6eoKuFTc94ufhaTppUlCioikL9a0Yb6pj3tr1xAln7fjrsueZQhlQJKrNGt01AD4r+lBimDFTz4XW4D+2KdClnJf2ZWN76KnIdYkb0BrdkyjhGQv7bnfbN1kYAKNBhLMGffCbm0ra1gHENuPE4HDwAyo1vOyYn4l5XNS3Er7wOzaVrQ2HyySIg396YoYSvODyGIkd5+ZS4xR1hLjHUpoc6uE3hQlnc9n36K2XdAAhAFWkn7xJ0KnFVfpop86HAgMBAAECggEBAMy4bjoaxcaTbJhl9Tp4YCPl6YzypD36u9LOlvSz4k4RX7mtIfUUQNZiYpMgIqteddfwMRTeLg8xFAguscC+fJVmVFzPkDl+LPymIbR/pl1RTOq6w42s1l2Vj2op3dJSLv1KknxKzFEKvIyJ3DlxT194PqJ2ys2CNCsDRS2hKNCUF+b1oNb/0ylAXC259WCnY33dRutlQyk+TZctL2q7ToxZedkiGDSG7wQ9ouyMKNI2smuTYcrO+Yig6VZPh7gD6iZXwW4uIZNC6WyfzYAQ6drkbtQdKWXKkYLzH3Dh06JT3bLaXdz3jpTAKKCy6eOnpfrG+/9pHfvn5XraqXyhmIECgYEA9YhLd24TCjFj4/Epjbc56iTj/5uocLQDkdOsl+vTF7ZqWldzW7GS1RNRr72IFvAyd2aEXIKlnwNWwS03WCY9Mily0djgH9lOMgnynT6UwM9gXZWVimIBKdDCG2oD+Ju5EaGoBwCqS26tcCbv+Yn14lVD19ILbkOZ2bfGjmf8rDkCgYEA9UdqA2zGpocnfbUC7YUipntGdou7cuMmthnzgmchHVaRJMhXBwFg0V7kIZL8aafUoPAQLXqQ1nj5/N9od4paqEXuK+baSbY5c7MPdKx+1R49DG0VhIUoPRypxyX/opkXLlFtFDYcqAL6o0SVsFMUI773USh8+aZhd5hZt6rd0L8CgYAMwbkSCnEIzYogFK6RA10J8kK6TA8TU/b/g5zrA8Ci8cJS0UpYEEDNu0Q6OkGw12f31ia4W71ZJqZCQSQn+0ygp5CkoHz8iqDKbsPhMZgu8FdUZWowl2jyEDuViwuLxiN2bAy72GgApU5zjkJXl7hjuwRcWTho0TBUJH03duWk2QKBgQDG02X/cryxHxwHDaVa7rJA6+sZi3mezr2BnhXD3l98jcDIZVIOjrJx5g7dnG3aI7772r3yb8la4eQbdOoVBOUqRM2lbtQCLqHxxPPBa1bA4WsxWHe53crZhxOlKItJvfmJhV37pUWjeA6+LIl+zkmkFFgcxMpSAOo/bRNFDFAUtwKBgQDAssoYhvF/ZpZKtTC2LNFXb0MgofwrMelh34ZQD8y5vmSjs+GM+FkW3fJbNTKJM1LW/9i+z97bPLjXe3tEow/L+9QiMN/GhlNOOLzlJ7h04AqTIZ29mhxAiuS6u3wcHLqNXGa3KPfJwyLWLLr96iaBr7Vt97UiwMmX4Yy3bpXcbw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6z/us/KkHPwHPCj/iPwPyJUoRH+g15jW8bgCUCCQy+ld9BBa7uYivIpK3Eg0Vgtsui7LfKOeGTRoG5dCnCLkZyVIOnqCrhU3PeLn4Wk6aVJQoqIpC/WtGG+qY97a9cQJZ+3467LnmUIZUCSqzRrdNQA+K/pQYpgxU8+F1uA/tinQpZyX9mVje+ipyHWJG9Aa3ZMo4RkL+2532zdZGACjQYSzBn3wm5tK2tYBxDbjxOBw8AMqNbzsmJ+JeVzUtxK+8Ds2la0Nh8skiIN/emKGErzg8hiJHefmUuMUdYS4x1KaHOrhN4UJZ3PZ9+itl3QAIQBVpJ+8SdCpxVX6aKfOhwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

