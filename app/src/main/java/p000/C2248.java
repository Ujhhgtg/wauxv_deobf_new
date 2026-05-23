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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2248 implements Consumer {

    public final /* synthetic */ int f7269 = 0;

    public final /* synthetic */ Class f7270;

    public final /* synthetic */ String f7271;

    public final /* synthetic */ FieldInfo f7272;

    public final /* synthetic */ Object f7273;

    public final /* synthetic */ Serializable f7274;

    public final /* synthetic */ Object f7275;

    public /* synthetic */ C2248(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, String str, FieldInfo fieldInfo, Class cls, String str2, String str3) {
        this.f7273 = readerAnnotationProcessor;
        this.f7271 = str;
        this.f7272 = fieldInfo;
        this.f7270 = cls;
        this.f7274 = str2;
        this.f7275 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (0) {
            case 0:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f7273).lambda$getFieldInfo$0(this.f7271, this.f7272, this.f7270, (String) this.f7274, (String) this.f7275, (Field) obj);
                break;
            default:
                ObjectReaderCreator.lambda$createObjectReaderWithCreator$0(this.f7270, (ObjectReaderProvider) this.f7273, (Class) this.f7274, (BeanInfo) this.f7275, this.f7271, this.f7272, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2248(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo) {
        this.f7270 = cls;
        this.f7273 = objectReaderProvider;
        this.f7274 = cls2;
        this.f7275 = beanInfo;
        this.f7271 = str;
        this.f7272 = fieldInfo;
    }
}
