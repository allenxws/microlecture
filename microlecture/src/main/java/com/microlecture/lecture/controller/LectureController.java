package com.microlecture.lecture.controller;

import com.microlecture.common.reponse.CommonListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Controller
@RequestMapping("/lecture")
public class LectureController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonListResponse list(@RequestParam("last_item_id") Long lastItemId, @RequestParam("page_size") Integer pageSize){

    }
}
