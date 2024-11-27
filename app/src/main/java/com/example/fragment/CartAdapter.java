package com.example.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fragment.R;
import com.example.fragment.CartItem;
import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<CartItem> cartItems;

    public CartAdapter(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        CartItem item = cartItems.get(position);

        holder.productName.setText(item.getProductName());
        holder.productDescription.setText(item.getProductDescription());
        holder.productImage.setImageResource(item.getProductImage());

        // Bạn có thể thêm các hành động vào các nút hoặc biểu tượng ở đây
    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        public TextView productName, productDescription;
        public ImageView productImage, deleteIcon;
        public Button buyNowButton;

        public CartViewHolder(View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name_1);
            productDescription = itemView.findViewById(R.id.product_description_1);
            productImage = itemView.findViewById(R.id.product_image_1);
            deleteIcon = itemView.findViewById(R.id.delete_icon_1);
            buyNowButton = itemView.findViewById(R.id.buy_now_button_1);
        }
    }
}

