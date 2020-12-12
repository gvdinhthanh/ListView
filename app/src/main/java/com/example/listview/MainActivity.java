package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.lang.String;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listviewTraiCay;
    ArrayList<traiCay> arrayTraiCay;
    traiCayAdapter adapterTraiCay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDuLieu();
        adapterTraiCay = new traiCayAdapter(this, R.layout.loai_traicay, arrayTraiCay);
        listviewTraiCay.setAdapter(adapterTraiCay);
    }

    private void getDuLieu(){
        listviewTraiCay = (ListView) findViewById(R.id.listViewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new traiCay("Quả Táo","Cân bằng đường huyết, xử trí tiêu chảy và táo bón, " +
                "giúp xương chắc khỏe, giảm cholesterol.",R.drawable.quatao));
        arrayTraiCay.add(new traiCay("Quả Mơ","Làm sáng da, bảo vệ mắt, điều hòa đường ruột, " +
                "ngăn ngừa tổn thương do các gốc tự do gây ra.",R.drawable.quamo));
        arrayTraiCay.add(new traiCay("Quả Lê","Nhuận trường nhẹ, xoa diệu thần kinh, " +
                "giúp khớp xương linh hoạt, ít gây dị ứng.",R.drawable.quale));
        arrayTraiCay.add(new traiCay("Quả Mận","Bảo vệ mắt, nhuận trường, cân bằng đường huyết, " +
                "hỗ trợ chức năng gan.",R.drawable.quaman));
        arrayTraiCay.add(new traiCay("Quả Kiwi","Thúc đẩy quá trình tổng hợp collagen, " +
                "có tính nhuận trường nhẹ, giúp giảm triglyceride trong máu, phòng chống cảm cúm.",R.drawable.quakiwi));
        arrayTraiCay.add(new traiCay("Quả Anh Đào (Cherry)","An thần, tăng cường sản sinh insulin, " +
                "giảm sưng viêm sau vận động, ngăn ngừa gout.",R.drawable.cherry));
        arrayTraiCay.add(new traiCay("Quả Nho","Giảm nguy cơ mắc bệnh ung thư, phòng chống sơ cứng động mạch, " +
                "có tính lợi tiểu nhẹ, giúp cân bằng đường huyết.",R.drawable.quanhovn));
        arrayTraiCay.add(new traiCay("Quả Mâm xôi đen","Tốt cho da, ruột, đường huyết, " +
                "chống ung thư.",R.drawable.quamamxoiden));
        arrayTraiCay.add(new traiCay("Quả Việt quất","Tốt cho tuyến tiền liệt, trí nhớ, " +
                "đường ruột và mắt.",R.drawable.quamo));
        arrayTraiCay.add(new traiCay("Quả Cơm cháy","Phòng cảm cúm, lợi tiểu nhẹ.",R.drawable.quacomchay));
        arrayTraiCay.add(new traiCay("Quả Dâu tằm","Phục hồi sinh lực, giảm mỏi mắt, an thần, " +
                "điều trị đầy hơi và táo bón.",R.drawable.quadautam));
        arrayTraiCay.add(new traiCay("Quả Mâm xôi đỏ","Hạn chế hấp thu chất béo, tăng độ dẻo dai cho tử cung, " +
                "chống ung thư.",R.drawable.quamamxoido));
        arrayTraiCay.add(new traiCay("Quả Dâu tây","Tốt cho mạch máu, dạ dày, " +
                "chứa các hoạt chất chống ung thư.",R.drawable.quadautay));
        arrayTraiCay.add(new traiCay("Quả Chuối","Giúp xương chắc khỏe, chống viêm loét, phóng thích đường chậm, " +
                "giảm nguy cơ mắc bệnh tim và đột quỵ.",R.drawable.quachuoi));
        arrayTraiCay.add(new traiCay("Quả Xoài","Nuôi dưỡng lợi khuẩn đường ruột, chứa chất kháng ung thư, " +
                "bảo vệ mắt, chống cảm cúm.",R.drawable.quaxoai));
        arrayTraiCay.add(new traiCay("Quả Đu đủ","Chứa enzyme tiêu hóa tự nhiên, chống nhiễm khuẩn, giúp giảm cholesterol, " +
                "giúp giảm nguy cơ mắc bệnh đục thủy tinh thể và bệnh tăng nhãn áp.",R.drawable.quadudu));
        arrayTraiCay.add(new traiCay("Quả Lựu","Giúp giảm nguy cơ mắc bệnh ung thư tuyến tiền liệt, giúp cho mạch máu đàn hồi, " +
                "mềm dẻo, ức chế, các enzyme gây tổn thương sụn, kháng khuẩn.",R.drawable.qualuu));
        arrayTraiCay.add(new traiCay("Quả Dứa (Khóm)","Xoa dịu các triệu chứng sưng viêm đường ruột, cải thiện chất lượng tinh trùng, " +
                "phục hồi các chấn thương do hoạt động thể thao.",R.drawable.quakhom));
    }
}