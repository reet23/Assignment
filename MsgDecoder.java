public class MsgDecoder {
    public static void main(String[] args) {
        Decoder d = new Decoder();
        int c = d.decoderCharacter('A');
        System.out.println(c);
    }
}

class Decoder {
    public int decoderCharacter(char ch) {
        int a = ch;
        return a;

    }
}
