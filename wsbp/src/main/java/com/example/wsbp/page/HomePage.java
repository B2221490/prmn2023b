package com.example.wsbp.page;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import com.example.wsbp.service.ISampleService;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;

@WicketHomePage
@MountPath("Home")
public class HomePage extends WebPage {
    @SpringBean
    private ISampleService service;
    public HomePage() {
        var youModel = Model.of("Wicket-Spring-Boot");
        var youLabel = new Label("you", youModel);
        add(youLabel);

        String gakusekibangou = "B2221490";
        var gakusekiModel = Model.of(gakusekibangou);
        var gakusekiLabel = new Label("gakuseki", gakusekiModel);
        add(gakusekiLabel);

        String shimei = "髙橋一斗";
        var shimeiModel = Model.of(shimei);
        var shimeiLabel = new Label("shimei", shimeiModel);
        add(shimeiLabel);

        int randInt = service.makeRandInt();
        var randModel = Model.of(randInt);
        var randLabel = new Label("rand", randModel);
        add(randLabel);

        var timeModel = Model.of(service.makeCurrentHMS());
        var timeLabel = new Label("time", timeModel);
        add(timeLabel);

        var toUserMakerLink = new BookmarkablePageLink<>("toUserMaker", UserMakerPage.class);
        add(toUserMakerLink);


    }
}