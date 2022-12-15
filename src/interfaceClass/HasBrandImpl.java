package interfaceClass;

public class HasBrandImpl implements HasBrand{
    private String brandName;
    private Integer price;
    private String status;

    public HasBrandImpl(String brandName, Integer price,String status) {
        this.brandName = brandName;
        this.price = price;
        this.status = status;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String getStatus() {
        return this.status;
    }
}

