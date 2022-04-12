package com.business.springbootsmallshops.service;

import com.business.springbootsmallshops.model.PurchaseHistory;
import com.business.springbootsmallshops.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
