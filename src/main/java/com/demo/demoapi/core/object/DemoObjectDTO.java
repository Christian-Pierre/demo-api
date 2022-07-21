package com.demo.demoapi.core.object;

import java.util.List;

public class DemoObjectDTO {
    private List<DemoObject> DemoObjectList;

    public List<DemoObject> getDemoObjectList() {
        return DemoObjectList;
    }

    public void setDemoObjectList(List<DemoObject> demoObjectList) {
        DemoObjectList = demoObjectList;
    }
}
