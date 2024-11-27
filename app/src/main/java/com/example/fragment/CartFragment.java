package com.example.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.fragment.CartAdapter;
import com.example.fragment.CartItem;
import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {

    private RecyclerView recyclerView;
    private CartAdapter adapter;
    private List<CartItem> cartItemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);

        // Khởi tạo RecyclerView và Adapter
        recyclerView = rootView.findViewById(R.id.recycler_view_cart);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Khởi tạo danh sách sản phẩm
        cartItemList = new ArrayList<>();

        // Thêm các sản phẩm vào danh sách (bạn có thể lấy từ cơ sở dữ liệu)
        cartItemList.add(new CartItem("Bánh Phô Mai Richeese Ahh", "Bánh Phô Mai Richeese Ahh Hộp 90G xốp giòn của lớp vỏ bánh hòa quyện vào lớp kem bên ngoài và phô mai bên trong béo ngậy, đậm đặc tan chảy ngay trong miệng.", R.drawable.banh_pho_mai));
        cartItemList.add(new CartItem("Bánh Karo Chà Bông Tươi Phô Mai", "Bánh Karo Chà Bông Tươi Phô Mai Hoàng Kim sở hữu hương vị đặc biệt, là sự hòa quyện hoàn hảo giữa trứng tươi, chà bông và phô mai, mang đến hương vị đậm đà và ngon miệng.", R.drawable.banh_karo));
        cartItemList.add(new CartItem("Bánh Xốp Phô Mai Nabati", "Bánh Xốp Phô Mai Nabati nổi tiếng với hương vị phô mai đậm đà, béo ngậy, thơm ngon, phủ đều trên bề mặt, tạo hương vị đặc trưng.", R.drawable.banh_nabati));
        cartItemList.add(new CartItem("Bánh Phô Mai Cal Cheese", "Bánh Xốp Nhân Phô Mai Cal Cheese có lớp vỏ bánh xốp giòn tan hòa quyện cùng lớp kem phô mai thơm ngậy.", R.drawable.banh_cheese));
        cartItemList.add(new CartItem("Bánh Gạo An", "Bánh Gạo An Ngọt Tự Nhiên Gói 226.8G mang hương vị thơm ngon từ gạo, được làm từ nguyên liệu thiên nhiên 100% gạo mới chọn lọc thơm ngon giống Nhật Japonica", R.drawable.banh_an));
        cartItemList.add(new CartItem("Bánh Kancho Socola", "Bánh Kancho SocolaLotte là loại bánh cao cấp đến từ Hàn Quốc sẽ là một loại bánh ăn vặt vừa thơm ngon vừa bổ dưỡng.", R.drawable.banh_kancho));
        cartItemList.add(new CartItem("Bánh KENJU Kem", "Bánh KENJU Kem Dẻo Hộp 279g với lớp vỏ giòn rụm kết hợp với phần nhân kem dẻo kéo sợi, không chỉ mang lại trải nghiệm mới lạ về thị giác mà còn mang lại vị ngon khó cưỡng cùng nguồn năng lượng cho cơ thể.", R.drawable.banh_kenju));

        // Khởi tạo Adapter và gán vào RecyclerView
        adapter = new CartAdapter(cartItemList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
