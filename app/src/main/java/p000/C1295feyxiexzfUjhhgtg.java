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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1295feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4725Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderCreator f4726Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f4727Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ long f4728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Class f4729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Type f4730Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f4731Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ String[] f4732Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f4733Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderProvider f4734Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4735Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1295feyxiexzfUjhhgtg(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f4726Ujhhgtgfeyxiexzf = objectReaderCreator;
        this.f4727Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4728Ujhhgtgfeyxiexzf = j;
        this.f4729Ujhhgtgfeyxiexzf = cls;
        this.f4730Ujhhgtgfeyxiexzf = type;
        this.f4731Ujhhgtgfeyxiexzf = str;
        this.f4732Ujhhgtgfeyxiexzf = strArr;
        this.f4735Ujhhgtgfeyxiexzf = beanInfo;
        this.f4733Ujhhgtgfeyxiexzf = linkedHashMap;
        this.f4734Ujhhgtgfeyxiexzf = objectReaderProvider;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4725Ujhhgtgfeyxiexzf) {
            case 0:
                this.f4726Ujhhgtgfeyxiexzf.lambda$createFieldReaders$2(this.f4727Ujhhgtgfeyxiexzf, this.f4728Ujhhgtgfeyxiexzf, this.f4731Ujhhgtgfeyxiexzf, this.f4729Ujhhgtgfeyxiexzf, this.f4730Ujhhgtgfeyxiexzf, (String) this.f4735Ujhhgtgfeyxiexzf, this.f4732Ujhhgtgfeyxiexzf, this.f4733Ujhhgtgfeyxiexzf, this.f4734Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            default:
                this.f4726Ujhhgtgfeyxiexzf.lambda$createFieldReaders$5(this.f4727Ujhhgtgfeyxiexzf, this.f4728Ujhhgtgfeyxiexzf, this.f4729Ujhhgtgfeyxiexzf, this.f4730Ujhhgtgfeyxiexzf, this.f4731Ujhhgtgfeyxiexzf, this.f4732Ujhhgtgfeyxiexzf, (BeanInfo) this.f4735Ujhhgtgfeyxiexzf, this.f4733Ujhhgtgfeyxiexzf, this.f4734Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C1295feyxiexzfUjhhgtg(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f4726Ujhhgtgfeyxiexzf = objectReaderCreator;
        this.f4727Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4728Ujhhgtgfeyxiexzf = j;
        this.f4731Ujhhgtgfeyxiexzf = str;
        this.f4729Ujhhgtgfeyxiexzf = cls;
        this.f4730Ujhhgtgfeyxiexzf = type;
        this.f4735Ujhhgtgfeyxiexzf = str2;
        this.f4732Ujhhgtgfeyxiexzf = strArr;
        this.f4733Ujhhgtgfeyxiexzf = linkedHashMap;
        this.f4734Ujhhgtgfeyxiexzf = objectReaderProvider;
    }
}
