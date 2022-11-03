package com.moonerhigh.ugomall.order.controller;

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
import com.moonerhigh.ugomall.order.dto.RefundInfoDTO;
import com.moonerhigh.ugomall.order.excel.RefundInfoExcel;
import com.moonerhigh.ugomall.order.service.RefundInfoService;
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
 * 退款信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@RestController
@RequestMapping("order/refundinfo")
@Api(tags="退款信息")
public class RefundInfoController {
    @Autowired
    private RefundInfoService refundInfoService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("order:refundinfo:page")
    public Result<PageData<RefundInfoDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RefundInfoDTO> page = refundInfoService.page(params);

        return new Result<PageData<RefundInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("order:refundinfo:info")
    public Result<RefundInfoDTO> get(@PathVariable("id") Long id){
        RefundInfoDTO data = refundInfoService.get(id);

        return new Result<RefundInfoDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("order:refundinfo:save")
    public Result save(@RequestBody RefundInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        refundInfoService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("order:refundinfo:update")
    public Result update(@RequestBody RefundInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        refundInfoService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("order:refundinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        refundInfoService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("order:refundinfo:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RefundInfoDTO> list = refundInfoService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, RefundInfoExcel.class);
    }

}
