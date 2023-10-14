package net.qzimyion.cellulose.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

public class CelluloseVillagerTrades {

    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 1, factories -> factories.add((((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 3),
                new ItemStack(Items.OAK_LOG, 8),
                6, 2, 0.02f
        ))))
        );
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 1, factories -> factories.add((((entity, random) -> new TradeOffer(
                new ItemStack(Items.OAK_LOG, 16),
                new ItemStack(CelluloseBlocks.AZALEA_LOG, 16),
                10, 5, 0.04f
        ))))
        );
    }
}
