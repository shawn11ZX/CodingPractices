package Q5;

public class Q5_8 {
    public static void drawPoint(byte[] screen, int width, int x, int y)
    {
        int offset = width / 8 * y + x / 8;
        int bit = x % 8;
        screen[offset] |= (1 << (7-bit));
    }
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y)
    {
        if (x1 > x2)
        {
            x1 = x1 ^ x2;
            x2 = x1 ^ x2;
            x1 = x1 ^ x2;
        }
        for (int x = x1; x <= x2; x++)
        {
            drawPoint(screen, width, x, y);
        }
    }
    public static void drawLine2(byte[] screen, int width, int x1, int x2, int y) {
        int start_offset = x1 % 8;
        int first_full_byte = x1 / 8;
        if (start_offset != 0) {
            first_full_byte++;
        }
        int end_offset = x2 % 8;
        int last_full_byte = x2 / 8;
        if (end_offset != 7) {
            last_full_byte--;
        }
// Set full bytes
        for (int b = first_full_byte; b <= last_full_byte; b++) {
            screen[(width / 8) * y + b] = (byte) 0xff;
        }
// Create masks for start and end of line
        byte start_mask = (byte) (0xFF >> start_offset);
        byte end_mask = (byte) -(0xFF >> (end_offset + 1));
// Set start and end of line
        if ((x1 / 8) == (x2 / 8)) { // xl and x2 are in the same byte
            byte mask = (byte) (start_mask & end_mask);
            screen[(width / 8) * y + (x1 / 8)] |= mask;
        } else {
            if (start_offset != 0) {
                int byte_number = (width / 8) * y + first_full_byte - 1;
                screen[byte_number] |= start_mask;
            }
            if (end_offset != 7) {
                int byte_number = (width / 8) * y + last_full_byte + 1;
                screen[byte_number] |= end_mask;
            }
        }
    }
}

