package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2498feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8160Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8161Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f8162Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2498feyxiexzfUjhhgtg(Annotation annotation, FieldInfo fieldInfo, int i) {
        this.f8160Ujhhgtgfeyxiexzf = i;
        this.f8161Ujhhgtgfeyxiexzf = annotation;
        this.f8162Ujhhgtgfeyxiexzf = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8160Ujhhgtgfeyxiexzf) {
            case 0:
                BeanUtils.lambda$processJacksonJsonIgnore$11(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processGsonSerializedName$19(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonUnwrapped$16(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonInclude$15(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonAlias$13(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSetter$12(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJSONField1x$14(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonProperty$11(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonProperty$6(this.f8161Ujhhgtgfeyxiexzf, this.f8162Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }
}
