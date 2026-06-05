package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛴᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1312feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4785Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Class f4786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f4787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f4788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4789Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f4790Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f4791Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1312feyxiexzfUjhhgtg(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, String str, FieldInfo fieldInfo, Class cls, String str2, String str3) {
        this.f4789Ujhhgtgfeyxiexzf = readerAnnotationProcessor;
        this.f4787Ujhhgtgfeyxiexzf = str;
        this.f4788Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4786Ujhhgtgfeyxiexzf = cls;
        this.f4790Ujhhgtgfeyxiexzf = str2;
        this.f4791Ujhhgtgfeyxiexzf = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4785Ujhhgtgfeyxiexzf) {
            case 0:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f4789Ujhhgtgfeyxiexzf).lambda$getFieldInfo$9(this.f4787Ujhhgtgfeyxiexzf, this.f4788Ujhhgtgfeyxiexzf, this.f4786Ujhhgtgfeyxiexzf, (String) this.f4790Ujhhgtgfeyxiexzf, (String) this.f4791Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            default:
                ObjectReaderCreator.lambda$createObjectReaderWithCreator$1(this.f4786Ujhhgtgfeyxiexzf, (ObjectReaderProvider) this.f4789Ujhhgtgfeyxiexzf, (Class) this.f4790Ujhhgtgfeyxiexzf, (BeanInfo) this.f4791Ujhhgtgfeyxiexzf, this.f4787Ujhhgtgfeyxiexzf, this.f4788Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C1312feyxiexzfUjhhgtg(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo) {
        this.f4786Ujhhgtgfeyxiexzf = cls;
        this.f4789Ujhhgtgfeyxiexzf = objectReaderProvider;
        this.f4790Ujhhgtgfeyxiexzf = cls2;
        this.f4791Ujhhgtgfeyxiexzf = beanInfo;
        this.f4787Ujhhgtgfeyxiexzf = str;
        this.f4788Ujhhgtgfeyxiexzf = fieldInfo;
    }
}
