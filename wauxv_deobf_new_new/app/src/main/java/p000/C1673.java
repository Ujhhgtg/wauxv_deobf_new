package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1673 f5641 = new C1673();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2452 f5642 = new C2452("kotlin.time.Instant", C2450.f7812);

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5642;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x047c  */
    /* JADX WARN: Code duplicated, block: B:196:0x049f  */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x047c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x049f, please report this as an issue */
    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        int i;
        InterfaceC1671 interfaceC1671M2599;
        int i2;
        int iM4770;
        int i3;
        char cCharAt;
        char cCharAt2;
        C1666 c1666 = C1666.f5630;
        String strMo2642 = interfaceC0978.mo2642();
        if (strMo2642.length() == 0) {
            interfaceC1671M2599 = new C1669("An empty string is not a valid Instant", strMo2642);
        } else {
            char cCharAt3 = strMo2642.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i4 = i;
            while (i4 < strMo2642.length() && '0' <= (cCharAt2 = strMo2642.charAt(i4)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo2642.charAt(i4) - '0');
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 10) {
                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected at most 10 digits for the year number, got " + i5 + " digits");
            } else if (i5 == 10 && AbstractC1469.m3327(strMo2642.charAt(i), 50) >= 0) {
                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected at most 9 digits for the year number or year 1000000000, got " + i5 + " digits");
            } else if (i5 < 4) {
                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "The year number must be padded to 4 digits, got " + i5 + " digits");
            } else if (cCharAt3 == '+' && i5 == 4) {
                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i5 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i6 = i4 + 16;
                if (strMo2642.length() < i6) {
                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "The input string is too short");
                } else {
                    C1669 c1669M2599 = AbstractC0972.m2599(strMo2642, "'-'", i4, new C1633(3));
                    if (c1669M2599 != null) {
                        interfaceC1671M2599 = c1669M2599;
                    } else {
                        interfaceC1671M2599 = AbstractC0972.m2599(strMo2642, "'-'", i4 + 3, new C1633(4));
                        if (interfaceC1671M2599 == null && (interfaceC1671M2599 = AbstractC0972.m2599(strMo2642, "'T' or 't'", i4 + 6, new C1633(5))) == null && (interfaceC1671M2599 = AbstractC0972.m2599(strMo2642, "':'", i4 + 9, new C1633(6))) == null && (interfaceC1671M2599 = AbstractC0972.m2599(strMo2642, "':'", i4 + 12, new C1633(7))) == null) {
                            int[] iArr = AbstractC0972.f3530;
                            for (int i7 = 0; i7 < 10; i7++) {
                                C1669 c1669M25910 = AbstractC0972.m2599(strMo2642, "an ASCII digit", iArr[i7] + i4, new C1633(8));
                                if (c1669M25910 != null) {
                                    interfaceC1671M2599 = c1669M25910;
                                }
                            }
                            int iM2601 = AbstractC0972.m2601(i4 + 1, strMo2642);
                            int iM2602 = AbstractC0972.m2601(i4 + 4, strMo2642);
                            int iM2603 = AbstractC0972.m2601(i4 + 7, strMo2642);
                            int iM2604 = AbstractC0972.m2601(i4 + 10, strMo2642);
                            int iM2605 = AbstractC0972.m2601(i4 + 13, strMo2642);
                            int i8 = i4 + 15;
                            if (strMo2642.charAt(i8) == '.') {
                                i8 = i6;
                                int iCharAt2 = 0;
                                while (i8 < strMo2642.length() && '0' <= (cCharAt = strMo2642.charAt(i8)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strMo2642.charAt(i8) - '0');
                                    i8++;
                                }
                                int i9 = i8 - i6;
                                if (1 > i9 || i9 >= 10) {
                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "1..9 digits are supported for the fraction of the second, got " + i9 + " digits");
                                } else {
                                    i2 = iCharAt2 * AbstractC0972.f3529[9 - i9];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i8 >= strMo2642.length()) {
                                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strMo2642.charAt(i8);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strMo2642.length() - i8;
                                    if (length > 9) {
                                        interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "The UTC offset string \"" + AbstractC0972.m2612(16, strMo2642.subSequence(i8, strMo2642.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Invalid UTC offset string \"" + strMo2642.subSequence(i8, strMo2642.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = AbstractC0972.f3531;
                                        int i10 = 0;
                                        for (int i11 = 2; i10 < i11; i11 = 2) {
                                            int i12 = i8 + iArr2[i10];
                                            if (i12 >= strMo2642.length()) {
                                                break;
                                            }
                                            if (strMo2642.charAt(i12) != ':') {
                                                StringBuilder sbM2802 = AbstractC1095.m2802(i12, "Expected ':' at index ", ", got '");
                                                sbM2802.append(strMo2642.charAt(i12));
                                                sbM2802.append('\'');
                                                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, sbM2802.toString());
                                            } else {
                                                i10++;
                                            }
                                        }
                                        int[] iArr3 = AbstractC0972.f3532;
                                        int i13 = 0;
                                        while (i13 < 6 && (i3 = iArr3[i13] + i8) < strMo2642.length()) {
                                            char cCharAt5 = strMo2642.charAt(i3);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM2803 = AbstractC1095.m2802(i3, "Expected an ASCII digit at index ", ", got '");
                                                sbM2803.append(strMo2642.charAt(i3));
                                                sbM2803.append('\'');
                                                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, sbM2803.toString());
                                            } else {
                                                i13++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iM2606 = AbstractC0972.m2601(i8 + 1, strMo2642);
                                        int iM2607 = length > 3 ? AbstractC0972.m2601(i8 + 4, strMo2642) : 0;
                                        int iM2608 = length > 6 ? AbstractC0972.m2601(i8 + 7, strMo2642) : 0;
                                        if (iM2607 > 59) {
                                            interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected offset-minute-of-hour in 0..59, got " + iM2607);
                                        } else if (iM2608 > 59) {
                                            interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected offset-second-of-minute in 0..59, got " + iM2608);
                                        } else if (iM2606 <= 17 || (iM2606 == 18 && iM2607 == 0 && iM2608 == 0)) {
                                            iM4770 = AbstractC2844.m4770(iM2607, 60, iM2606 * 3600, iM2608) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM2601 || iM2601 >= 13) {
                                                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected a month number in 1..12, got " + iM2601);
                                            } else if (1 > iM2602) {
                                                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected a valid day-of-month for month " + iM2601 + " of year " + iCharAt + ", got " + iM2602);
                                            } else {
                                                int i14 = iCharAt & 3;
                                                if (iM2602 > (iM2601 != 2 ? (iM2601 == 4 || iM2601 == 6 || iM2601 == 9 || iM2601 == 11) ? 30 : 31 : i14 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected a valid day-of-month for month " + iM2601 + " of year " + iCharAt + ", got " + iM2602);
                                                } else if (iM2603 > 23) {
                                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected hour in 0..23, got " + iM2603);
                                                } else if (iM2604 > 59) {
                                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected minute-of-hour in 0..59, got " + iM2604);
                                                } else if (iM2605 > 59) {
                                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected second-of-minute in 0..59, got " + iM2605);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = ((long) 365) * j;
                                                    long jM4771 = (j >= 0 ? ((j + ((long) 399)) / ((long) 400)) + (((((long) 3) + j) / ((long) 4)) - ((((long) 99) + j) / ((long) 100))) + j2 : AbstractC2844.m4771(j, -400, (j / ((long) (-4))) - (j / ((long) (-100))), j2)) + ((long) (((iM2601 * 367) - 362) / 12)) + ((long) (iM2602 - 1));
                                                    if (iM2601 > 2) {
                                                        jM4771 = (i14 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? jM4771 - 2 : (-1) + jM4771;
                                                    }
                                                    interfaceC1671M2599 = new C1670((((jM4771 - ((long) 719528)) * ((long) 86400)) + ((long) AbstractC2844.m4770(iM2604, 60, iM2603 * 3600, iM2605))) - ((long) iM4770), i2);
                                                }
                                            }
                                        } else {
                                            interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected an offset in -18:00..+18:00, got " + strMo2642.subSequence(i8, strMo2642.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i15 = i8 + 1;
                                    if (strMo2642.length() == i15) {
                                        iM4770 = 0;
                                        if (1 <= iM2601) {
                                            interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected a month number in 1..12, got " + iM2601);
                                        } else {
                                            interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected a month number in 1..12, got " + iM2601);
                                        }
                                    } else {
                                        interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Extra text after the instant at position " + i15);
                                    }
                                } else {
                                    interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "Expected the UTC offset at position " + i8 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                interfaceC1671M2599 = AbstractC0972.m2600(strMo2642, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return interfaceC1671M2599.toInstant();
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        interfaceC1207.mo2930(((C1666) obj).toString());
    }
}
