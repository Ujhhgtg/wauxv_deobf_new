package p000;

import com.umeng.analytics.pro.r;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1683 implements InterfaceC3407 {
    f5713("header_item", 0),
    f5714("string_id_item", 1),
    f5715("type_id_item", 2),
    f5716("proto_id_item", 3),
    f5717("field_id_item", 4),
    f5718("method_id_item", 5),
    f5719("class_def_item", 6),
    f5720("call_site_id_item", 7),
    f5721("method_handle_item", 8),
    f5722("map_list", 4096),
    f5723("type_list", 4097),
    f5724("annotation_set_ref_list", 4098),
    f5725("annotation_set_item", 4099),
    f5726("class_data_item", 8192),
    f5727("code_item", 8193),
    f5728("string_data_item", 8194),
    f5729("debug_info_item", 8195),
    f5730("annotation_item", 8196),
    f5731("encoded_array_item", 8197),
    f5732("annotations_directory_item", 8198),
    f5733("map_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("type_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("exception_handler_item", -1),
    f5734("annotation_set_ref_item", -1);


    public final int f5736;

    public final String f5737;

    public final String f5738;

    EnumC1683(String str, int i) {
        this.f5736 = i;
        this.f5737 = str;
        this.f5738 = (str.endsWith("_item") ? AbstractC2784.m4744(5, 0, str) : str).replace('_', ' ');
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f5738;
    }
}
