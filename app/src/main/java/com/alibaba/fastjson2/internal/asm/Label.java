package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_RESOLVED = 4;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    public Object info;
    Label nextBasicBlock;
    Label nextListElement;
    Edge outgoingEdges;
    short outputStackMax;

    private void addForwardReference(int i, int i2, int i3) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    public final void put(ByteVector byteVector, int i, boolean z) {
        if ((this.flags & 4) != 0) {
            if (z) {
                byteVector.putInt(this.bytecodeOffset - i);
                return;
            } else {
                byteVector.putShort(this.bytecodeOffset - i);
                return;
            }
        }
        if (z) {
            addForwardReference(i, FORWARD_REFERENCE_TYPE_WIDE, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i, FORWARD_REFERENCE_TYPE_SHORT, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public final boolean resolve(byte[] bArr, int i) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i;
        int[] iArr = this.forwardReferences;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = FORWARD_REFERENCE_HANDLE_MASK & i4;
            if ((i4 & FORWARD_REFERENCE_TYPE_MASK) != FORWARD_REFERENCE_TYPE_SHORT) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i5 >>> 24);
                i6 += 2;
                bArr[i7] = (byte) (i5 >>> 16);
            } else if (i5 < -32768 || i5 > 32767) {
                int i8 = bArr[i3] & 255;
                if (i8 < 198) {
                    bArr[i3] = (byte) (i8 + 49);
                } else {
                    bArr[i3] = (byte) (i8 + 20);
                }
                z = true;
            }
            bArr[i6] = (byte) (i5 >>> 8);
            bArr[i6 + 1] = (byte) i5;
        }
        return z;
    }
}
