package p000;

import bsh.C0029Ujhhgtgfeyxiexzf;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1292feyxiexzfUjhhgtg implements Function {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4709Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4710Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1292feyxiexzfUjhhgtg(int i, Object obj) {
        this.f4709Ujhhgtgfeyxiexzf = i;
        this.f4710Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4709Ujhhgtgfeyxiexzf) {
            case 0:
                return ObjectReaderCreator.lambda$createBuildFunction$7((Method) this.f4710Ujhhgtgfeyxiexzf, obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$6((Constructor) this.f4710Ujhhgtgfeyxiexzf, obj);
            case 2:
                return ObjectReaderImplList.lambda$of$0((Type) this.f4710Ujhhgtgfeyxiexzf, obj);
            case 3:
                return ((ObjectReaderImplList) this.f4710Ujhhgtgfeyxiexzf).lambda$readJSONBObject$12(obj);
            case 4:
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = (C0029Ujhhgtgfeyxiexzf) this.f4710Ujhhgtgfeyxiexzf;
                String str = (String) obj;
                if (c0029Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                try {
                    return c0029Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, false);
                } catch (Exception unused) {
                    return null;
                }
            default:
                Iterator it = (Iterator) this.f4710Ujhhgtgfeyxiexzf;
                StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf((String) obj, " ");
                sbM4805Ujhhgtgfeyxiexzf.append((String) it.next());
                return sbM4805Ujhhgtgfeyxiexzf.toString();
        }
    }
}
