package cn.fx.jlx.springMVC.springMVC;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfig {
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500689425";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCSsyNgClFLVO6NSJ+nEhgLKGOopgrNTgq/YKF69cUux3f6DKGpjrJhIWS0Glc5r2gE3olOctsuIcA3c24GUibBo2kzXq2eYww95oA0HMLOrGllmFGVLRTILFRDajLRuYLuuOVzpykRADb5Y5oELLY+RluiQqOVGJrY77Yk4PTEfoVPqDOItgGbdprmXC53x8hfyRv6163t/AmZ/MjB6Z5mxgrpEzmO3zjsNJEVkjUNetvTzaonJRkrxPugZZrwptXiTbCYE8hWHRt4f6ucaagMh7f29modzFSeWnQMRd8gsfbhcCmc0a1AKSP1hrlbVatbJXrWhwV3G60rT07v4LOFAgMBAAECggEBAIr+K9A9NlUXvYYjfxD+tcUsmXAbEjT/cnNtDNLBtffiiixid3F9gElDKHT0WByRsw6aAqJPdJe65rIjLeXTRGFHgM9pLzrYQasMj//QGEtVU+8saG/c7MnUJmpRXqETEZk5mjz/7orrFysnUbAO5QUQCJYuaWtEisJsLLm4YnEgsRLQ3v6j1jbp0+T0x1B/gO3SUw85ep1re1SMJ++NxtmEAneV+Zlwi5o9Rwof8E2BzlUNssFF4K0ikypdB5O2r5eHbe7H9bdZ3xZpmaQcczzh9jpZ4Z/1xPNHyT9ZSj4dhJ3uUHK+ZQ3ubhv5q1YfXuMa+/siFUsxOiBvqiAgkKkCgYEA6sD+TfGAW7jxRnJABdpvy406iUTr5t1dSkhUVvQFTzQkd+oxOk35/BuNftzJrEV4twRBVdd3jfS7JN87I1ezRKgXYZA5vlfUVAQAdcP+fmK2fVsc/JOFndxEFFs2r8pJXLNhB+gal3lNLW6GGhkj2z9sFUL1Tk4DxwsWfhiQhnsCgYEAn/oFaClCge5cfH2jm36qtZ3YmzrrcszAH04ybH7NNCFpLtBPXp2oToousnoPNqhi3WrHbROwVtn7aokxtxwnXExZIcc0+jB8J8lsYq+aSfBxoBPQRoGc1cYM7BWLuCZ+n4Z7DmgtJ3Q1NF4OTeig3ClOIDKiVBnvlLgD70a7jf8CgYEAlqJSTCdsKu8IeyCyrk7VL7Mm3ZBJIzHmO9UfsVAR3BnkUMII5pXElB4F9GKuUgmeBSoI1pFVGNTyBR3s76fF04dcwXDvbJElIOgUd3zVX7ntyZBekEAFHB+L29gPxksyOfasi4tHDO18NWvXRwXcuUIAE8CMcbujtuQJgc43ZuMCgYBbrzcaE0uCm9F1p6v0mgvMOsLBdGssSBxz1KUheSqyDdPyeICEgWbMXHWW5E2Dzc2biG7zHK2bmSJ2VFqhzwjf5QHQUhMSsGb3hoEPrgSHC76TN8fOIMp52h/dzhtdVvKLCs/L2fjG+9riQGWCUSigBSw5V8ug15xvZ2cZ4zfqkQKBgFTv45EUk/2QXH+dtmv612TopszHUMORKjmpcMVeU/ZfSPUL2uyqXo0GdQ+bzvXxJsTeBGVWo0WS08Ngpem+0hpIha2nubiF0DktvCtpZhUkRg7qPYRNIMbEiWk4szcP7K1sSWDsqreqrjhIV7m4OP88k3Y7fqSzv4yRLsBVNb6H";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgsG0CCwuMmjJf1HLi8PJQT//JKJev+NEiawZmorFdlX9DAlmbEr9rhmE7vPy+7ilJU1WD8/H2+j5XoMN3HhWCsvJ+TwpwWKue0v1DnSd4tqXWNt8TjPDVNVZzUFiAVAZBwWSOlj9IV78P8WqZii7nK0AHmqzP1v9K8sSAaUW8+YJF35usXTXE24bxom9b46IavSFCeyyS4pVAEx3dC1eOiIhhEn744lz0MvF28ejIkeLrXME2hBA5zM/PYHkYGNGitJ0gMg+V3sv1qQGqb9HgGMZC6FV3h4XD24sZ4TIFWUNvsnwqbPlnHY84UcoGofnro7dfqnZ+T8G5+FzsBopYwIDAQAB";
	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://192.168.1.19:8086/springMVC/ali/paycomplate";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
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