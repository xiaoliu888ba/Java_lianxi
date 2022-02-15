package Example.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BuHuo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));

    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        try {
            //
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e){
            UnsupportedEncodingException:
            System.out.println(e);
        }
        return s.getBytes();
    }
}
