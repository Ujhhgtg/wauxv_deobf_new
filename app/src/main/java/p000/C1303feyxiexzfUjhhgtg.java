package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriterCreatorASM;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛴᛱUjhhgtgᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1303feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4754Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f4755Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ long f4756Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f4757Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterProvider f4758Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Class f4759Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f4761Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterCreator f4762Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1303feyxiexzfUjhhgtg(ObjectWriterCreator objectWriterCreator, FieldInfo fieldInfo, long j, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, boolean z, LinkedHashMap linkedHashMap, int i) {
        this.f4754Ujhhgtgfeyxiexzf = i;
        this.f4762Ujhhgtgfeyxiexzf = objectWriterCreator;
        this.f4755Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4756Ujhhgtgfeyxiexzf = j;
        this.f4757Ujhhgtgfeyxiexzf = beanInfo;
        this.f4758Ujhhgtgfeyxiexzf = objectWriterProvider;
        this.f4759Ujhhgtgfeyxiexzf = cls;
        this.f4760Ujhhgtgfeyxiexzf = z;
        this.f4761Ujhhgtgfeyxiexzf = linkedHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4754Ujhhgtgfeyxiexzf) {
            case 0:
                this.f4762Ujhhgtgfeyxiexzf.lambda$createObjectWriter$2(this.f4755Ujhhgtgfeyxiexzf, this.f4756Ujhhgtgfeyxiexzf, this.f4757Ujhhgtgfeyxiexzf, this.f4758Ujhhgtgfeyxiexzf, this.f4759Ujhhgtgfeyxiexzf, this.f4760Ujhhgtgfeyxiexzf, this.f4761Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                ((ObjectWriterCreatorASM) this.f4762Ujhhgtgfeyxiexzf).lambda$createObjectWriter$1(this.f4755Ujhhgtgfeyxiexzf, this.f4756Ujhhgtgfeyxiexzf, this.f4757Ujhhgtgfeyxiexzf, this.f4758Ujhhgtgfeyxiexzf, this.f4759Ujhhgtgfeyxiexzf, this.f4760Ujhhgtgfeyxiexzf, this.f4761Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }
}
