package cn.fx.jlx.springMVC.springMVC;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfig {
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500689421";

	// 商户私钥，您的PKCS8格式RSA2私钥
	 public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC2aEDA2a3MkVS3hSO8GjzWD7f6Xim7ZLEb7LqLuTbCXTO4Zeo7ns7efx/u94vxPiJ8IsSLrtVbWVr2N1oNh2zCUmQWcnf0yqBHF/I6Sgh2KJlzjf7TTkVPdacRS3jDVFYJOqJWU16VRBzFssi59orgogpwqgQFm+V3vOwusTODnqnFd5EPRqbIcm+2zgJdh570SJCtQ85oHr/A7OcRpAirMud9DcbmgknEP/sNZ7Yxf8IxwgCtUdVJLRhCltdNERwWkuBGa5KvflnHrxBJSyVG41U26oKaKTDHMbmnqpqMmnvR7qhxu50yHexjCBHlBJV4/cpXE4xJN8r1cMOCwAB7AgMBAAECggEAFST+pJxXLkiGhoOTgeGUvceyrv4tXkCs2yzU7w94To2ZSj3eKi0dk+Muo3fkrAFk4/jvybVpnB4+kh4WfUz+iYQdgBCi4Sh/7d3TwXgFhRTtvNxv9rSzCiP8St/xzsq+8nDuko01gJ4Vq8EuzYfLz4BZL3g14SSSNBAdXMhDzXTrvVRsD4BkWT9SPNgQQionCbOO27gKBX6Y7LTS+9zLUvMFGxBkuJ5uyrjtqhtqb/cVOX5etII8pwmf9KBRE/l4IfwMN8FI6HS6PVN2FpZHC075BxYtxl8GqKYZRZdphuiS1Q+MGHO3mouw+MsrYCoT41EUheGn00pruMtu5+etQQKBgQDp70ZJ+F00Jkx9pGaAnvPhhQjJb7s3rFHWl1YWH/vPljtqoUP3RDi41jO71UuwSX9yvcYjC8F15gGON9eNzB0kB6fmilpLcWfI8Z18aWFWp1a84tfTTfYhmYKXTRSwInZ21jF77rvrdp534OQXAMuufMJ2LoxM8tl+JW9KnI5MmwKBgQDHnMQ4KgDOImDdvylMOaBnRmM+LumLmG5OyK783MWrFtebp74XcWMYUj1uqgEdNkv0c0o0rQXnct0gFqq92fagobK6QVL/8oRULcsaKFnDP1eceKC5dK1Hdtl+oMnFrGuaCi6yDhMix1l16EXfwPWbSZGQ6o11J3QANfgdTEcpoQKBgQCAlKn3wnHIVjy42oIUtEmsbWj0/1rSMP8SikAhDRdldFfYNiebY34h6mqpFYXysZNByBl97do6KWA1gXATWluyEBszVlxnF0BKbLN5TJrZ/ERqseybEkD1GuFytEVowqiGjRjJ2+CifaKAlbYJBsDteVmRh+hJ6zmsYnsXcZGtfQKBgQDFnHzk3TBO4dnjrQvFWodhtl0pgmfSuuT5OdOCoU1PQx3QCxA1RRtFSKVomQThVo97QWeFHoVpzFz9F3OQ3+c4vtuhaGoy2HQIog0fqDK1CFBDp2f2MXwZ8579rVATUc50gQAZZbWsCI6YG4qRKQX85agmPw4rnRNJ4iPvXURWAQKBgDi17xl/cXvG2P4PLZzuAaK08x3sGzyG2wQMP4NG0UX5LpXLK4lIpk80ZBuKDH1xvH/53EMxyUCz0AdgFaalIprelhrBr6EJVlRf1Yn7ciUuQMRL3PzCGHN7Ro8p5bNUToSlb5EG0cdxZL6sX89Y+qujQwOmBMUvJ9lPS2RbExbm";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	 public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkDekSlaoKztgeAkJFVdzlylTKDBbO5BqslYqJ2WE3IdL1CGkVTnKywPjIejnqADaAI3Z0tDKI+bDuJcuJ1nnjndBRy3QwxCq/0S101STSYAmzyQjppsuOj8pTA9p5fZROrIMu3JXlUK8X96VZeKP5pIyebNLtn9FqehWUhv/v15J1scFsGCDIjcFo6MunkFBUY0Veq1JPcNdv/hPp+vnPbHeEBQ8UukBk6ZRGQzUj5Cva5KP2gpEJePL81eEJdOWk3worMmISemT8LCqdby70aL3mnsxk22tawxU8vIlZofd0ModNgWja+HuvlR/+itFgCRoOwyvXxY9GBVNBrhFAwIDAQAB";
	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://127.0.0.1:8086/springMVC/ali/paycomplate";

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