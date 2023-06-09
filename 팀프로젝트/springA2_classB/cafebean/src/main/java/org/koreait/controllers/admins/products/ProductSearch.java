package org.koreait.controllers.admins.products;

import lombok.Data;

@Data
public class ProductSearch {
    private int page = 1;
    private int limit = 20;

    private String sopt; //검색 조건
    private String skey; //검색 키워드
}
