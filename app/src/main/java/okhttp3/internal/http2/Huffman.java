package okhttp3.internal.http2;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import okhttp3.internal.Util;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC2595feyxiexzfUjhhgtg;
import p000.InterfaceC2596feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Huffman {
    public static final Huffman INSTANCE = new Huffman();
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, Opcodes.IDIV, Opcodes.LDIV, UMErrorCode.E_UM_BE_JSON_FAILED, UMErrorCode.E_UM_BE_CREATE_FAILED, 112, 113, UMErrorCode.E_UM_BE_FILE_OVERSIZE, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, Opcodes.INEG, Opcodes.LNEG, 40, 41, 42, 7, 43, Opcodes.FNEG, 44, 8, 9, 45, Opcodes.DNEG, 120, 121, 122, Opcodes.LSHR, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] CODE_BIT_COUNTS = {ek.k, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, ek.k, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, ek.m, 6, 12, 10, ek.k, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, ek.k, 19, ek.k, ek.l, 6, ek.m, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, ek.m, 11, ek.l, ek.k, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final Node root = new Node();

    static {
        for (int i = 0; i < 256; i++) {
            INSTANCE.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i, int i2, int i3) {
        Node node = new Node(i, i3);
        Node node2 = root;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            Node[] children = node2.getChildren();
            Node node3 = children[i4];
            if (node3 == null) {
                node3 = new Node();
                children[i4] = node3;
            }
            node2 = node3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        Arrays.fill(node2.getChildren(), i6, (1 << i5) + i6, node);
    }

    public final void decode(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, long j, InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
        Node node = root;
        int iAnd = 0;
        int terminalBitCount = 0;
        for (long j2 = 0; j2 < j; j2++) {
            iAnd = (iAnd << 8) | Util.and(interfaceC2595feyxiexzfUjhhgtg.readByte(), 255);
            terminalBitCount += 8;
            while (terminalBitCount >= 8) {
                node = node.getChildren()[(iAnd >>> (terminalBitCount - 8)) & 255];
                if (node.getChildren() == null) {
                    interfaceC2596feyxiexzfUjhhgtg.writeByte(node.getSymbol());
                    terminalBitCount -= node.getTerminalBitCount();
                    node = root;
                } else {
                    terminalBitCount -= 8;
                }
            }
        }
        while (terminalBitCount > 0) {
            Node node2 = node.getChildren()[(iAnd << (8 - terminalBitCount)) & 255];
            if (node2.getChildren() != null || node2.getTerminalBitCount() > terminalBitCount) {
                return;
            }
            interfaceC2596feyxiexzfUjhhgtg.writeByte(node2.getSymbol());
            terminalBitCount -= node2.getTerminalBitCount();
            node = root;
        }
    }

    public final void encode(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < iMo2578Ujhhgtgfeyxiexzf; i2++) {
            int iAnd = Util.and(c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i2), 255);
            int i3 = CODES[iAnd];
            byte b = CODE_BIT_COUNTS[iAnd];
            j = (j << b) | ((long) i3);
            i += b;
            while (i >= 8) {
                i -= 8;
                interfaceC2596feyxiexzfUjhhgtg.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            interfaceC2596feyxiexzfUjhhgtg.writeByte((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public final int encodedLength(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        long j = 0;
        for (int i = 0; i < iMo2578Ujhhgtgfeyxiexzf; i++) {
            j += (long) CODE_BIT_COUNTS[Util.and(c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i), 255)];
        }
        return (int) ((j + ((long) 7)) >> 3);
    }

    /* JADX INFO: compiled from: obf */
    public static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[bc.e];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i, int i2) {
            this.children = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBitCount = i3 == 0 ? 8 : i3;
        }
    }
}
