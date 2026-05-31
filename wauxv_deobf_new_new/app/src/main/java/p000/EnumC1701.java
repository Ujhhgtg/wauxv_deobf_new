package p000;

import com.umeng.analytics.pro.r;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1701 implements InterfaceC3466 {
    f5756("header_item", 0),
    f5757("string_id_item", 1),
    f5758("type_id_item", 2),
    f5759("proto_id_item", 3),
    f5760("field_id_item", 4),
    f5761("method_id_item", 5),
    f5762("class_def_item", 6),
    f5763("call_site_id_item", 7),
    f5764("method_handle_item", 8),
    f5765("map_list", 4096),
    f5766("type_list", r.a.a),
    f5767("annotation_set_ref_list", r.a.b),
    f5768("annotation_set_item", r.a.c),
    f5769("class_data_item", 8192),
    f5770("code_item", r.a.r),
    f5771("string_data_item", r.a.s),
    f5772("debug_info_item", r.a.t),
    f5773("annotation_item", r.a.u),
    f5774("encoded_array_item", r.a.v),
    f5775("annotations_directory_item", 8198),
    f5776("map_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("type_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("exception_handler_item", -1),
    f5777("annotation_set_ref_item", -1);


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5781;

    EnumC1701(String str, int i) {
        this.f5779 = i;
        this.f5780 = str;
        this.f5781 = (str.endsWith("_item") ? AbstractC2844.m4778(5, 0, str) : str).replace('_', ' ');
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f5781;
    }
}
