package javaapplication1;


public class Phanso {
    //Thuoc tinh
    private int tuSo;
    private int mauSo;

    // Ham tao mac dinh
    public Phanso() {
        tuSo = 0;
        mauSo = 1;
    }

    //Ham tao co doi
    public Phanso(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException(
                "Mau so khong duoc bang 0"
            );
        }

        this.tuSo = tuSo;
        this.mauSo = mauSo;
        chuanHoa();
    }

    //Getter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Setter
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException(
                "Mau so khong duoc bang 0"
            );
        }

        this.mauSo = mauSo;
        chuanHoa();
    }

    //  Chuan hoa dau va rut gon phan so
    private void chuanHoa() {
        if (tuSo == 0) {
            mauSo = 1;
            return;
        }

        int uoc = ucln(tuSo, mauSo);
        tuSo /= uoc;
        mauSo /= uoc;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    //Tim uoc chung lon nhat
    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Rut gon phan so
    public void rutGon() {
        chuanHoa();
    }

    // 9. Ham toString
    @Override
    public String toString() {
        if (mauSo == 1) {
            return String.valueOf(tuSo);
        }

        return tuSo + "/" + mauSo;
    }

    //tong
    public Phanso cong(Phanso p) {
        return new Phanso(
            tuSo * p.mauSo + p.tuSo * mauSo,
            mauSo * p.mauSo
        );
    }

    //hieu
    public Phanso tru(Phanso p) {
        return new Phanso(
            tuSo * p.mauSo - p.tuSo * mauSo,
            mauSo * p.mauSo
        );
    }

    // Tinh tich
    public Phanso nhan(Phanso p) {
        return new Phanso(
            tuSo * p.tuSo,
            mauSo * p.mauSo
        );
    }

    // Tinh thuong
    public Phanso chia(Phanso p) {
        if (p.tuSo == 0) {
            throw new ArithmeticException(
                "Khong the chia cho 0"
            );
        }

        return new Phanso(
            tuSo * p.mauSo,
            mauSo * p.tuSo
        );
    }

    //So sanh hai phan so
    public int soSanh(Phanso p) {
        long a = (long) tuSo * p.mauSo;
        long b = (long) p.tuSo * mauSo;

        return Long.compare(a, b);
    }
}

