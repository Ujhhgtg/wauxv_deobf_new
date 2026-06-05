package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2502feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8172Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8173Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f8174Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2502feyxiexzfUjhhgtg(BeanInfo beanInfo, Annotation annotation, int i) {
        this.f8172Ujhhgtgfeyxiexzf = i;
        this.f8174Ujhhgtgfeyxiexzf = beanInfo;
        this.f8173Ujhhgtgfeyxiexzf = annotation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8172Ujhhgtgfeyxiexzf) {
            case 0:
                BeanUtils.lambda$isWriteEnumAsJavaBean$3(this.f8174Ujhhgtgfeyxiexzf, this.f8173Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processJacksonJsonInclude$14(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonTypeName$17(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonFormat$13(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.lambda$getCreator$6(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.lambda$getCreator$7(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.lambda$getCreator$5(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonTypeInfo$6(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 8:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processSeeAlsoAnnotation$8(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 9:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSubTypes$4(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 10:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonIgnoreProperties$7(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 11:
                BeanUtils.processJSONType1x(this.f8174Ujhhgtgfeyxiexzf, this.f8173Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case Opcodes.FCONST_1 /* 12 */:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonSubTypes$1(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonTypeInfo$3(this.f8173Ujhhgtgfeyxiexzf, this.f8174Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2502feyxiexzfUjhhgtg(Annotation annotation, BeanInfo beanInfo, int i) {
        this.f8172Ujhhgtgfeyxiexzf = i;
        this.f8173Ujhhgtgfeyxiexzf = annotation;
        this.f8174Ujhhgtgfeyxiexzf = beanInfo;
    }
}
