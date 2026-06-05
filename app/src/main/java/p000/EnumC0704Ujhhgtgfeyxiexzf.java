package p000;

import com.umeng.analytics.pro.r;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛴᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0704Ujhhgtgfeyxiexzf implements InterfaceC1724Ujhhgtgfeyxiexzf {
    f2886Ujhhgtgfeyxiexzf("header_item", 0),
    f2887Ujhhgtgfeyxiexzf("string_id_item", 1),
    f2888Ujhhgtgfeyxiexzf("type_id_item", 2),
    f2889Ujhhgtgfeyxiexzf("proto_id_item", 3),
    f2890Ujhhgtgfeyxiexzf("field_id_item", 4),
    f2891Ujhhgtgfeyxiexzf("method_id_item", 5),
    f2892Ujhhgtgfeyxiexzf("class_def_item", 6),
    f2893Ujhhgtgfeyxiexzf("call_site_id_item", 7),
    f2894Ujhhgtgfeyxiexzf("method_handle_item", 8),
    f2895Ujhhgtgfeyxiexzf("map_list", 4096),
    f2896Ujhhgtgfeyxiexzf("type_list", r.a.a),
    f2897Ujhhgtgfeyxiexzf("annotation_set_ref_list", r.a.b),
    f2898Ujhhgtgfeyxiexzf("annotation_set_item", r.a.c),
    f2899Ujhhgtgfeyxiexzf("class_data_item", 8192),
    f2900Ujhhgtgfeyxiexzf("code_item", r.a.r),
    f2901Ujhhgtgfeyxiexzf("string_data_item", r.a.s),
    f2902Ujhhgtgfeyxiexzf("debug_info_item", r.a.t),
    f2903Ujhhgtgfeyxiexzf("annotation_item", r.a.u),
    f2904Ujhhgtgfeyxiexzf("encoded_array_item", r.a.v),
    f2905feyxiexzfUjhhgtg("annotations_directory_item", 8198),
    f2906feyxiexzfUjhhgtg("map_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("type_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("exception_handler_item", -1),
    f2907feyxiexzfUjhhgtg("annotation_set_ref_item", -1);


    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2909Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f2910Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f2911Ujhhgtgfeyxiexzf;

    EnumC0704Ujhhgtgfeyxiexzf(String str, int i) {
        this.f2909Ujhhgtgfeyxiexzf = i;
        this.f2910Ujhhgtgfeyxiexzf = str;
        this.f2911Ujhhgtgfeyxiexzf = (str.endsWith("_item") ? AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(5, 0, str) : str).replace('_', ' ');
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f2911Ujhhgtgfeyxiexzf;
    }
}
