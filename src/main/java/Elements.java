public class Elements {
    static String homeBtn = "//*[@class='android.view.View' and ./*[@text='Home'] and ./*[@class='android.view.ViewGroup']]";
    static String assetMngr = "//*[@contentDescription='wallet-screen-button-asset-manager']";
    static String bitcoinBtn = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Bitcoin'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView'] and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup']]]]";
    static String dogecoinBtn = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Dogecoin'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView'] and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup']]]]";
    static String closeMngr = "//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Asset Manager'] and (./preceding-sibling::* | ./following-sibling::*)[./*[@class='android.view.ViewGroup']]]";
    static String dogecoinTxt ="//*[@text='Dogecoin']";
    static String bitcoincoinTxt ="//*[@text='Bitcoin']";
}
