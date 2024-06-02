package controller;

import dao.XeMayDAO;
import java.util.ArrayList;
import model.XeMay;

/**
 *
 * @author 
 */
public class SearchProduct {

    public static SearchProduct getInstance() {
        return new SearchProduct();
    }

    public ArrayList<XeMay> searchTatCa(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 1) {
                if (xm.getMaXe().toLowerCase().contains(text.toLowerCase()) || xm.getTenXe().toLowerCase().contains(text.toLowerCase())
                        || xm.gettenDongCo().toLowerCase().contains(text.toLowerCase())
                        || xm.getdoCaoYen().toLowerCase().contains(text.toLowerCase())
                        || xm.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
                    result.add(xm);
                }
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchMaXe(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 1) {
                if (xm.getMaXe().toLowerCase().contains(text.toLowerCase())) {
                    result.add(xm);
                }
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchTenXe(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 1) {
                if (xm.getTenXe().toLowerCase().contains(text.toLowerCase())) {
                    result.add(xm);
                }
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchSoLuong(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 1) {
                if (text.length() != 0) {
                    if (xm.getSoLuong() > Integer.parseInt(text)) {
                        result.add(xm);
                    }
                } else {
                    result.add(xm);
                }
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchDonGia(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 1) {

                if (text.length() != 0) {
                    if (xm.getGia() > Integer.parseInt(text)) {
                        result.add(xm);
                    }
                }
                else {
                    result.add(xm);
                }
            } 
        }
        return result;
    }

    public ArrayList<XeMay> searchphanKhoi(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getphanKhoi().toLowerCase().contains(text.toLowerCase())) {
                result.add(xm);
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchtenDongCo(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.gettenDongCo().toLowerCase().contains(text.toLowerCase())) {
                result.add(xm);
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchTieuThu(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.gettieuThuNL().toLowerCase().contains(text.toLowerCase())) {
                result.add(xm);
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchDoCaoYen(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getdoCaoYen().toLowerCase().contains(text.toLowerCase())) {
                result.add(xm);
            }
        }
        return result;
    }


    public ArrayList<XeMay> searchXuatXu(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
                result.add(xm);
            }
        }
        return result;
    }

    public ArrayList<XeMay> searchDaXoa(String text) {
        ArrayList<XeMay> result = new ArrayList<>();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAll();
        for (var xm : arxm) {
            if (xm.getTrangThai() == 0) {
                if (xm.getMaXe().toLowerCase().contains(text.toLowerCase())) {
                    result.add(xm);
                }
            }
        }
        return result;
    }

    public XeMay searchId(String text) {
        XeMay result = new XeMay();
        ArrayList<XeMay> arxm = XeMayDAO.getInstance().selectAllExist();
        for (var xm : arxm) {
            if (xm.getMaXe().toLowerCase().contains(text.toLowerCase())) {
                return xm;
            }
        }
        return null;
    }
}
