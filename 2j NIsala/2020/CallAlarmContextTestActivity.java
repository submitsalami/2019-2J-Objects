CalendarService myService =
        new CalendarService("SimpleGoogleAlarmClock");
    myService.setUserCredentials(mail, decryptedPass);
    URL feedUrl = new URL("https://www.google.com/calendar/feeds/default/private/full");

    CalendarQuery myQuery = new CalendarQuery(feedUrl);
    myQuery.setMinimumStartTime(s);
    myQuery.setMaximumStartTime(e);
    myQuery.setFullTextQuery(query);
    myQuery.setStringCustomParameter("singleevents", "true");
    myQuery.setStringCustomParameter("sortorder", "a");

    CalendarEventFeed myResultsFeed =
        myService.query(myQuery, CalendarEventFeed.class);

    for (int i = 0; i &lt; myResultsFeed.getEntries().size(); i++) {
        CalendarEventEntry MatchEntry = (CalendarEventEntry) myResultsFeed.getEntries().get(i);
        String time = MatchEntry.getTimes().get(0).getStartTime().toUiString();
        String wakeup = MatchEntry.getTitle().getPlainText();
        queryArea.append("\t" + time + " " + wakeup + "\n");
    }