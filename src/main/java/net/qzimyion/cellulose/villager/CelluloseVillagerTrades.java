package net.qzimyion.cellulose.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class CelluloseVillagerTrades {

    @SuppressWarnings("unused")
    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 1, factories -> {
                    final boolean add = factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.OAK_LOG, 8),
                            6, 2, 0.02f
                    ))));}
        );
    }
}
