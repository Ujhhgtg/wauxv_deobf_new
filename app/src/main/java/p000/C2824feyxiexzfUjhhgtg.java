package p000;

import android.app.AlertDialog;
import com.alibaba.fastjson2.JSONWriter;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2824feyxiexzfUjhhgtg extends AbstractC1181feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8981Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8982Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2824feyxiexzfUjhhgtg(Object obj, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, int i) {
        super(2, interfaceC3704Ujhhgtgfeyxiexzf);
        this.f8981Ujhhgtgfeyxiexzf = i;
        this.f8982Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) throws Throwable {
        InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf = (InterfaceC3745Ujhhgtgfeyxiexzf) obj;
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = (InterfaceC3704Ujhhgtgfeyxiexzf) obj2;
        switch (this.f8981Ujhhgtgfeyxiexzf) {
            case 0:
                return ((C2824feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf, interfaceC3745Ujhhgtgfeyxiexzf)).mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
            case 1:
                C2824feyxiexzfUjhhgtg c2824feyxiexzfUjhhgtg = (C2824feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf, interfaceC3745Ujhhgtgfeyxiexzf);
                C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                c2824feyxiexzfUjhhgtg.mo1208Ujhhgtgfeyxiexzf(c1943Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C2824feyxiexzfUjhhgtg c2824feyxiexzfUjhhgtg2 = (C2824feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf, interfaceC3745Ujhhgtgfeyxiexzf);
                C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf2 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                c2824feyxiexzfUjhhgtg2.mo1208Ujhhgtgfeyxiexzf(c1943Ujhhgtgfeyxiexzf2);
                return c1943Ujhhgtgfeyxiexzf2;
        }
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final InterfaceC3704Ujhhgtgfeyxiexzf mo1767Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) {
        switch (this.f8981Ujhhgtgfeyxiexzf) {
            case 0:
                return new C2824feyxiexzfUjhhgtg((C2831feyxiexzfUjhhgtg) this.f8982Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 0);
            case 1:
                return new C2824feyxiexzfUjhhgtg((C3677feyxiexzfUjhhgtg) this.f8982Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 1);
            default:
                return new C2824feyxiexzfUjhhgtg((AlertDialog) this.f8982Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final Object mo1208Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        long length;
        switch (this.f8981Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                Iterator it = ((C2831feyxiexzfUjhhgtg) this.f8982Ujhhgtgfeyxiexzf).f8999Ujhhgtgfeyxiexzf.iterator();
                long j = 0;
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (!file.exists()) {
                        length = 0;
                    } else if (file.isFile()) {
                        length = file.length();
                    } else {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            long jM2766Ujhhgtgfeyxiexzf = 0;
                            for (File file2 : fileArrListFiles) {
                                jM2766Ujhhgtgfeyxiexzf += AbstractC1246feyxiexzfUjhhgtg.m2766Ujhhgtgfeyxiexzf(file2);
                            }
                            length = jM2766Ujhhgtgfeyxiexzf;
                        } else {
                            length = 0;
                        }
                    }
                    j += length;
                }
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (j < 1024) {
                    String str = String.format(Locale.CHINA, MagicFactory.get(4928301588625229194L, strArr), Arrays.copyOf(new Object[]{Double.valueOf(j)}, 1));
                    MagicFactory.get(4928301558560458122L, strArr);
                    return str;
                }
                if (j < JSONWriter.MASK_USE_SINGLE_QUOTES) {
                    String str2 = String.format(Locale.CHINA, MagicFactory.get(4928301644459804042L, strArr), Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
                    MagicFactory.get(4928301610100065674L, strArr);
                    return str2;
                }
                if (j < JSONWriter.MASK_ESCAPE_NONE_ASCII) {
                    String str3 = String.format(Locale.CHINA, MagicFactory.get(4928301695999411594L, strArr), Arrays.copyOf(new Object[]{Double.valueOf((j / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(4928301661639673226L, strArr);
                    return str3;
                }
                String str4 = String.format(Locale.CHINA, MagicFactory.get(4928301747539019146L, strArr), Arrays.copyOf(new Object[]{Double.valueOf(((j / 1024.0d) / 1024.0d) / 1024.0d)}, 1));
                MagicFactory.get(4928301850618234250L, strArr);
                return str4;
            case 1:
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg = (C3677feyxiexzfUjhhgtg) this.f8982Ujhhgtgfeyxiexzf;
                ((C0400Ujhhgtgfeyxiexzf) c3677feyxiexzfUjhhgtg.f11679Ujhhgtgfeyxiexzf.getValue()).mo1679feyxiexzfUjhhgtg(new C2579Ujhhgtgfeyxiexzf(c3677feyxiexzfUjhhgtg)).m1681feyxiexzfUjhhgtg();
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            default:
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                ((AlertDialog) this.f8982Ujhhgtgfeyxiexzf).dismiss();
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
