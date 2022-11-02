package com.moonerhigh.ugomall.coupon.controller;

import com.moonerhigh.ugomall.common.annotation.LogOperation;
import com.moonerhigh.ugomall.common.constant.Constant;
import com.moonerhigh.ugomall.common.page.PageData;
import com.moonerhigh.ugomall.common.utils.ExcelUtils;
import com.moonerhigh.ugomall.common.utils.Result;
import com.moonerhigh.ugomall.common.validator.AssertUtils;
import com.moonerhigh.ugomall.common.validator.ValidatorUtils;
import com.moonerhigh.ugomall.common.validator.group.AddGroup;
import com.moonerhigh.ugomall.common.validator.group.DefaultGroup;
import com.moonerhigh.ugomall.common.validator.group.UpdateGroup;
import com.moonerhigh.ugomall.coupon.dto.HomeAdvDTO;
import com.moonerhigh.ugomall.coupon.excel.HomeAdvExcel;
import com.moonerhigh.ugomall.coupon.service.HomeAdvService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 首页轮播广告
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@RestController
@RequestMapping("coupon/homeadv")
@Api(tags="首页轮播广告")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("coupon:homeadv:page")
    public Result<PageData<HomeAdvDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<HomeAdvDTO> page = homeAdvService.page(params);

        return new Result<PageData<HomeAdvDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("coupon:homeadv:info")
    public Result<HomeAdvDTO> get(@PathVariable("id") Long id){
        HomeAdvDTO data = homeAdvService.get(id);

        return new Result<HomeAdvDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("coupon:homeadv:save")
    public Result save(@RequestBody HomeAdvDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        homeAdvService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("coupon:homeadv:update")
    public Result update(@RequestBody HomeAdvDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        homeAdvService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("coupon:homeadv:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        homeAdvService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("coupon:homeadv:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<HomeAdvDTO> list = homeAdvService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, HomeAdvExcel.class);
    }

}
