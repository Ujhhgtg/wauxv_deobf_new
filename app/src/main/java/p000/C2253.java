package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2253 implements Consumer {

    public final /* synthetic */ int f7296 = 1;

    public final /* synthetic */ ObjectReaderCreator f7297;

    public final /* synthetic */ FieldInfo f7298;

    public final /* synthetic */ long f7299;

    public final /* synthetic */ String f7300;

    public final /* synthetic */ Class f7301;

    public final /* synthetic */ Type f7302;

    public final /* synthetic */ String f7303;

    public final /* synthetic */ String[] f7304;

    public final /* synthetic */ BeanInfo f7305;

    public final /* synthetic */ LinkedHashMap f7306;

    public final /* synthetic */ ObjectReaderProvider f7307;

    public /* synthetic */ C2253(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, BeanInfo beanInfo, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f7297 = objectReaderCreator;
        this.f7298 = fieldInfo;
        this.f7299 = j;
        this.f7300 = str;
        this.f7301 = cls;
        this.f7302 = type;
        this.f7303 = str2;
        this.f7304 = strArr;
        this.f7305 = beanInfo;
        this.f7306 = linkedHashMap;
        this.f7307 = objectReaderProvider;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (1) {
            case 0:
                this.f7297.lambda$createFieldReaders$1(this.f7298, this.f7299, this.f7300, this.f7301, this.f7302, this.f7303, this.f7304, this.f7306, this.f7307, this.f7305, (Field) obj);
                break;
            default:
                this.f7297.lambda$createFieldReaders$2(this.f7298, this.f7299, this.f7300, this.f7301, this.f7302, this.f7303, this.f7304, this.f7305, this.f7306, this.f7307, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2253(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo) {
        this.f7297 = objectReaderCreator;
        this.f7298 = fieldInfo;
        this.f7299 = j;
        this.f7300 = str;
        this.f7301 = cls;
        this.f7302 = type;
        this.f7303 = str2;
        this.f7304 = strArr;
        this.f7306 = linkedHashMap;
        this.f7307 = objectReaderProvider;
        this.f7305 = beanInfo;
    }
}
