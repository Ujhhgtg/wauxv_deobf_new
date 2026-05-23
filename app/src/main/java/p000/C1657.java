package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᛸᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1657 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1657 f5603 = new C1657();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2399 f5604 = new C2399("kotlin.time.Instant", C2397.f7668);

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f5604;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0483  */
    /* JADX WARN: Code duplicated, block: B:196:0x04a6  */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x0483, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x04a6, please report this as an issue */
    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        int i;
        InterfaceC1656 interfaceC1656M2989;
        int i2;
        int iM4736;
        int i3;
        char cCharAt;
        char cCharAt2;
        C1652 c1652 = C1652.f5595;
        String strMo2518 = interfaceC0974.mo2518();
        if (strMo2518.length() == 0) {
            interfaceC1656M2989 = new C1654("An empty string is not a valid Instant", strMo2518);
        } else {
            char cCharAt3 = strMo2518.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i4 = i;
            while (i4 < strMo2518.length() && '0' <= (cCharAt2 = strMo2518.charAt(i4)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo2518.charAt(i4) - '0');
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 10) {
                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected at most 10 digits for the year number, got " + i5 + " digits");
            } else if (i5 == 10 && AbstractC2207.m4089(strMo2518.charAt(i), 50) >= 0) {
                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected at most 9 digits for the year number or year 1000000000, got 10 digits");
            } else if (i5 < 4) {
                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "The year number must be padded to 4 digits, got " + i5 + " digits");
            } else if (cCharAt3 == '+' && i5 == 4) {
                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i5 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i6 = i4 + 16;
                if (strMo2518.length() < i6) {
                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "The input string is too short");
                } else {
                    C1654 c1654M2989 = AbstractC1270.m2989(strMo2518, "'-'", i4, new C1608(17));
                    if (c1654M2989 != null) {
                        interfaceC1656M2989 = c1654M2989;
                    } else {
                        interfaceC1656M2989 = AbstractC1270.m2989(strMo2518, "'-'", i4 + 3, new C1608(18));
                        if (interfaceC1656M2989 == null && (interfaceC1656M2989 = AbstractC1270.m2989(strMo2518, "'T' or 't'", i4 + 6, new C1608(19))) == null && (interfaceC1656M2989 = AbstractC1270.m2989(strMo2518, "':'", i4 + 9, new C1608(20))) == null && (interfaceC1656M2989 = AbstractC1270.m2989(strMo2518, "':'", i4 + 12, new C1608(21))) == null) {
                            int[] iArr = AbstractC1270.f4641;
                            for (int i7 = 0; i7 < 10; i7++) {
                                C1654 c1654M29810 = AbstractC1270.m2989(strMo2518, "an ASCII digit", iArr[i7] + i4, new C1608(22));
                                if (c1654M29810 != null) {
                                    interfaceC1656M2989 = c1654M29810;
                                }
                            }
                            int iM2991 = AbstractC1270.m2991(i4 + 1, strMo2518);
                            int iM2992 = AbstractC1270.m2991(i4 + 4, strMo2518);
                            int iM2993 = AbstractC1270.m2991(i4 + 7, strMo2518);
                            int iM2994 = AbstractC1270.m2991(i4 + 10, strMo2518);
                            int iM2995 = AbstractC1270.m2991(i4 + 13, strMo2518);
                            int i8 = i4 + 15;
                            if (strMo2518.charAt(i8) == '.') {
                                i8 = i6;
                                int iCharAt2 = 0;
                                while (i8 < strMo2518.length() && '0' <= (cCharAt = strMo2518.charAt(i8)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strMo2518.charAt(i8) - '0');
                                    i8++;
                                }
                                int i9 = i8 - i6;
                                if (1 > i9 || i9 >= 10) {
                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "1..9 digits are supported for the fraction of the second, got " + i9 + " digits");
                                } else {
                                    i2 = iCharAt2 * AbstractC1270.f4640[9 - i9];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i8 >= strMo2518.length()) {
                                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strMo2518.charAt(i8);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strMo2518.length() - i8;
                                    if (length > 9) {
                                        interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "The UTC offset string \"" + AbstractC1270.m2999(16, strMo2518.subSequence(i8, strMo2518.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Invalid UTC offset string \"" + strMo2518.subSequence(i8, strMo2518.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = AbstractC1270.f4642;
                                        int i10 = 0;
                                        for (int i11 = 2; i10 < 2; i11 = 2) {
                                            int i12 = i8 + iArr2[i10];
                                            if (i12 >= strMo2518.length()) {
                                                break;
                                            }
                                            if (strMo2518.charAt(i12) != ':') {
                                                StringBuilder sbM2787 = AbstractC1194.m2787(i12, "Expected ':' at index ", ", got '");
                                                sbM2787.append(strMo2518.charAt(i12));
                                                sbM2787.append('\'');
                                                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, sbM2787.toString());
                                            } else {
                                                i10++;
                                            }
                                        }
                                        int[] iArr3 = AbstractC1270.f4643;
                                        int i13 = 0;
                                        while (i13 < 6 && (i3 = iArr3[i13] + i8) < strMo2518.length()) {
                                            char cCharAt5 = strMo2518.charAt(i3);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM2788 = AbstractC1194.m2787(i3, "Expected an ASCII digit at index ", ", got '");
                                                sbM2788.append(strMo2518.charAt(i3));
                                                sbM2788.append('\'');
                                                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, sbM2788.toString());
                                            } else {
                                                i13++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iM2996 = AbstractC1270.m2991(i8 + 1, strMo2518);
                                        int iM2997 = length > 3 ? AbstractC1270.m2991(i8 + 4, strMo2518) : 0;
                                        int iM2998 = length > 6 ? AbstractC1270.m2991(i8 + 7, strMo2518) : 0;
                                        if (iM2997 > 59) {
                                            interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected offset-minute-of-hour in 0..59, got " + iM2997);
                                        } else if (iM2998 > 59) {
                                            interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected offset-second-of-minute in 0..59, got " + iM2998);
                                        } else if (iM2996 <= 17 || (iM2996 == 18 && iM2997 == 0 && iM2998 == 0)) {
                                            iM4736 = AbstractC2784.m4736(iM2997, 60, iM2996 * 3600, iM2998) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM2991 || false) {
                                                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected a month number in 1..12, got " + iM2991);
                                            } else if (1 > iM2992) {
                                                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected a valid day-of-month for month " + iM2991 + " of year " + iCharAt + ", got " + iM2992);
                                            } else {
                                                int i14 = iCharAt & 3;
                                                if (iM2992 > (31)) {
                                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected a valid day-of-month for month " + iM2991 + " of year " + iCharAt + ", got " + iM2992);
                                                } else if (iM2993 > 23) {
                                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected hour in 0..23, got " + iM2993);
                                                } else if (iM2994 > 59) {
                                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected minute-of-hour in 0..59, got " + iM2994);
                                                } else if (iM2995 > 59) {
                                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected second-of-minute in 0..59, got " + iM2995);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = ((long) 365) * j;
                                                    long jM4737 = (j >= 0 ? ((j + ((long) 399)) / ((long) 400)) + (((((long) 3) + j) / ((long) 4)) - ((((long) 99) + j) / ((long) 100))) + j2 : AbstractC2784.m4737(j, -400, (j / ((long) (-4))) - (j / ((long) (-100))), j2)) + ((long) (((iM2991 * 367) - 362) / 12)) + ((long) (iM2992 - 1));
                                                    if (false) {
                                                        jM4737 = (i14 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? jM4737 - 2 : (-1) + jM4737;
                                                    }
                                                    interfaceC1656M2989 = new C1655((((jM4737 - ((long) 719528)) * ((long) 86400)) + ((long) AbstractC2784.m4736(iM2994, 60, iM2993 * 3600, iM2995))) - ((long) iM4736), i2);
                                                }
                                            }
                                        } else {
                                            interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected an offset in -18:00..+18:00, got " + strMo2518.subSequence(i8, strMo2518.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i15 = i8 + 1;
                                    if (strMo2518.length() == i15) {
                                        iM4736 = 0;
                                        if (1 <= iM2991) {
                                            interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected a month number in 1..12, got " + iM2991);
                                        } else {
                                            interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected a month number in 1..12, got " + iM2991);
                                        }
                                    } else {
                                        interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Extra text after the instant at position " + i15);
                                    }
                                } else {
                                    interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "Expected the UTC offset at position " + i8 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                interfaceC1656M2989 = AbstractC1270.m2990(strMo2518, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return interfaceC1656M2989.toInstant();
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2808(((C1652) obj).toString());
    }
}
