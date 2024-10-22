package wifi_project;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class wifi {
	//Maven 프로젝트 설치 안함.
	

    public static void main(String[] args) {
        String ssid = "MyNetwork";         // 네트워크 SSID
        String password = "MyPassword";    // 네트워크 비밀번호
        String encryption = "WPA";         // 암호화 방식 (WPA, WEP, nopass)

        // QR 코드로 변환할 Wi-Fi 정보
        String wifiInfo = String.format("WIFI:S:%s;T:%s;P:%s;;", ssid, encryption, password);

        // QR 코드 생성
        try {
            generateQRCodeImage(wifiInfo, 300, 300, "wifi_qrcode.png");
        } catch (WriterException | IOException e) {
            System.out.println("QR 코드 생성 중 오류 발생: " + e.getMessage());
        }
    }

    // generateQRCodeImage 함수
    private static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? Color.BLACK.getRGB() : Color.WHITE.getRGB());
            }
        }

        File outputFile = new File(filePath);
        ImageIO.write(image, "png", outputFile);
        System.out.println("QR 코드가 " + filePath + "에 저장되었습니다.");
    }
}
